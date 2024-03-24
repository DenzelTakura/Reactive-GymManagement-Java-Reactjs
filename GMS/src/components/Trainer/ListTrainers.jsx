import { Component, useEffect, useState } from "react";
import trainerService from "../../services/trainerService";
import TrainerTable from "./TrainerTable";
import styles from '../css/form.module.css'

export default function ListTrainers(){

    const [trainers,setTrainers]= useState([]);

    useEffect(()=>{trainerService.fetchAll().then((response)=>setTrainers(response.data))},[])
    return <div >
        <TrainerTable trainers={trainers} setTrainers={setTrainers}/>
    </div>
}