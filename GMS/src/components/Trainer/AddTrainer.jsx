import trainerService from "../../services/trainerService";
import Form from "./Form";

export default function AddTrainer(){

    function createTrainer(trainer){
        trainerService.createTrainer(trainer).then(
            console.log(trainer)
        )
       
    }
    return <div> <Form formheader={"Add Trainer"} submitMethod={createTrainer} submitBtnText={"Save"}/>
    </div>
}