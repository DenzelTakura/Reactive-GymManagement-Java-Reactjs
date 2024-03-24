import { useState } from "react";
import styles from "../css/form.module.css";
import InputBox from "./InputBox";
import Button from "./Button";
import trainerService from "../../services/trainerService";

export default function Form({formheader,submitBtnText,submitMethod}) {
  const [id, setId] = useState(null);
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [phoneNumber, setPhoneNumber] = useState("");
  const [idNumber, setIdNumber] = useState("");
  const [emailAddress, setEmailAddress] = useState("");
  const [specialty, setSpecialty] = useState("");
  const [gender, setGender] = useState("");

  let trainer = {
    id:null,
    firstName: firstName,
    lastName: lastName,
    phoneNumber: phoneNumber,
    idNumber: idNumber,
    emailAddress: emailAddress,
    specialty: specialty,
    gender: gender,
  };
  

  function handleSubmit(e) {
    e.preventDefault();
   
    console.log(idNumber);
    submitMethod(trainer.id,trainer);
    trainerService.createTrainer(trainer);
  }
  
  return (
    <form className={styles.todoForm} onSubmit={handleSubmit}>
      <div className={styles.inputContainer}>
        <div className={styles.headerLabel}>
          <h1>{formheader}</h1>
        </div>

        <InputBox
          type="text"
          labelText={"First Name"}
          methodCall={setFirstName}
          value={trainer.firstName}
    
        />
        <InputBox
          type="text"
          labelText={"Last Name"}
          methodCall={setLastName}
          value={trainer.lastName}
        />
        <InputBox type="text"
         labelText={"Gender"}
          methodCall={setGender} 
          value={trainer.gender}
          />
        <InputBox
          type="text"
          labelText={"Id Number"}
          methodCall={setIdNumber}
          value={trainer.idNumber}
        />
        <InputBox
          type="text"
          labelText={"Phone No"}
          methodCall={setPhoneNumber}
          value={trainer.phoneNumber}
        />
        <InputBox
          type="text"
          labelText={"Email Address"}
          methodCall={setEmailAddress}
          value={trainer.emailAddress}
        />
        <InputBox
          type="text"
          labelText={"Specialty "}
          methodCall={setSpecialty}
          value={trainer.specialty}
        />
        <div className={styles.btnContainer}>
          <Button type="submit" styling={styles.submitBtn} buttonText={submitBtnText} />
          <Button styling={styles.cancelBtn} buttonText="Cancel" />
        </div>
      </div>
    </form>
  );
}
