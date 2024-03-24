import styles from "../css/form.module.css";
import "bootstrap/dist/css/bootstrap.min.css";
import Button from "./Button";
import trainerService from "../../services/trainerService";
import {  useNavigate } from "react-router-dom";

export default function TrainerTable({ trainers, setTrainers }) {

  const navigateTo = useNavigate();

  function handleDelete(trainer) {
    console.log("deleted " + trainer.firstName);
    trainerService
      .deleteById(trainer.id)
      .then(setTrainers(trainers.filter((T) => T !== trainer)));
  }

  function handleUpdate(trainerId){
    // trainerService.getTrainerValue();
    navigateTo(`/trainer/update/${trainerId}`)

  
  }
  return (
    <div className={styles.parentContainer}>
      <h2 className="text-center">Trainer List</h2>
      <div className={styles.hearder}>
        <div className={styles.scrollTable}>
          <table className="table table-striped table-bordered table-hover">
            <thead>
              <tr>
                <th>Trainer First Name</th>
                <th>Trainer Last Name</th>
                <th>Trainer Gender</th>
                <th>Trainer Id-Number</th>
                <th>Trainer Phone Number</th>
                <th>Trainer Email-Address</th>
                <th>Trainer Specialty</th>
                <th>Action</th>
              </tr>
            </thead>
            <tbody>
              {trainers.map((trainer) => (
                <tr key={trainer.id}>
                  <td>{trainer.firstName}</td>
                  <td>{trainer.lastName}</td>
                  <td>{trainer.gender}</td>
                  <td>{trainer.idNumber}</td>
                  <td>{trainer.phoneNumber}</td>
                  <td>{trainer.emailAddress}</td>
                  <td>{trainer.specialty}</td>

                  <td>
                    {" "}
                    <div className={styles.tablebtnContainer}>
                      <Button
                      method={() => handleUpdate(trainer.id)}
                        styling={styles.submitBtn}
                        buttonText={"Update"} 
                      />
                      <Button
                        styling={styles.cancelBtn}
                        method={() => handleDelete(trainer)}
                        buttonText={"Delete"}
                      />
                    </div>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
}
