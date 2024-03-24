import { useState } from "react";
import trainerService from "../../services/trainerService";
import Form from "./Form";


export default function updatetrainer(){

    let obj= {
        id:null,
        firstName: "firstName",
        lastName: lastName,
        phoneNumber: phoneNumber,
        idNumber: idNumber,
        emailAddress: emailAddress,
        specialty: specialty,
        gender: gender,
      };

function updateTrainer(trainerId,trainer){
    console.log(trainer);
    trainerService.updateTrainer(trainerId,trainer)
    
}

  

    return <div><Form formheader={"Update Trainer"} submitMethod={updateTrainer} submitBtnText={"Update"}/>
    </div>
}