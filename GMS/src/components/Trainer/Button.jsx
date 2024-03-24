import styles from '../css/form.module.css'

export default function Button({styling,buttonText,method}){
    return <div>
         <button onClick={method} className={styling}>{buttonText}</button>
    </div>
       
    
}