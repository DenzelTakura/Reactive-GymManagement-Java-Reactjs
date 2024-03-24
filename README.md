# Reactive-GymManagement-Java-Reactjs

Basic concepts of a GymManagement System

MySql,
Java(Springboot),
Javascript,
React.Js

feel free to clone and view

Below shows the trainer service in Javascript passing data to and from the frontend to the backend

```
import axios from "axios";

const baseUrl = "http://localhost:8080/api/trainer";
let obj = null;

class TrainerService {
  createTrainer(trainer) {
    return axios
      .post(baseUrl + "/add", trainer)
      .then((response) => console.log("success"))
      .catch(console.error("failed to save ", error));
  }
  fetchAll() {
    return axios.get(baseUrl + "/all");
  }

  deleteById(id) {
    console.log("reached");
    return axios
      .delete(baseUrl + "/delete/" + id)
      .then((response) => {
        console.log("Deleted " + trainer.firstName);
      })
      .catch((error) => {
        console.error("Error deleting trainer:", error);
      });
  }

  updateTrainer(trainerid, trainer) {
    return axios
      .put(baseUrl + "/update/" + trainer)
      .then((response) => console.log("success Update/" + trainerid, trainer))
      .catch(console.error("failed to update ", error));
  }

  fetchById(trainerid) {
    return axios
      .get(baseUrl + "/" + trainerid)
      .then((response) => {
        console.log("fetched " + trainerid);
      })
      .catch((error) => {
        console.error("Error fetching trainer:", error);
      });
  }
}

export default new TrainerService();
```    return axios
      .get(baseUrl + "/" + trainerid)
      .then((response) => {
        console.log("fetched " + trainerid);    return axios
      .get(baseUrl + "/" + trainerid)
      .then((response) => {
        console.log("fetched " + trainerid);    return axios
      .get(baseUrl + "/" + trainerid)
      .then((response) => {
        console.log("fetched " + trainerid);
