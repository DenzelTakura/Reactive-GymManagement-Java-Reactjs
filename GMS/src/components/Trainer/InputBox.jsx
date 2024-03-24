
import styles from '../css/form.module.css'
export default function InputBox({type,labelText,methodCall,}){

    return <div>
        <label className={styles.labels}> {labelText +':'}</label>
        <input type={type} className={styles.inputBox}  placeholder={labelText} onChange={(e)=>methodCall(e.target.value)} />
          </div>
}