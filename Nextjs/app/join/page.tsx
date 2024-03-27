'use client';

import { useState } from "react";
import axios from "axios";
import { useRouter } from "next/navigation";

const SERVER = 'http://localhost:8080'

export default function Join() {

  const router = useRouter();

  const [memId, setMemId] = useState('')
  const [memPw, setMemPw] = useState('')
  const [name, setName] = useState('')
  const [phone, setPhone] = useState('')
  const [job, setJob] = useState('')
  const [height, setHeight] = useState('')
  const [weight, setWeight] = useState('')

  const handleMemId = (e: any) => {
    setMemId(e.target.value);
  }

  const handleMemPw = (e: any) => {
    setMemPw(e.target.value);
  }
  const handleName = (e: any) => {
    setName(e.target.value);
  }
  const handlePhone = (e: any) => {
    setPhone(e.target.value);
  }
  const handleJob = (e: any) => {
    setJob(e.target.value);
  }
  const handleHeigtht = (e: any) => {
    setHeight(e.target.value);
  }
  const handleWeigtht = (e: any) => {
    setWeight(e.target.value);
  }
  const handleSubmit = () => {
    const url = `${SERVER}/api/join`
    const data = { memId, memPw, name, phone, job, height, weight }
    const config = {
      headers: {
        "Cache-Control": "no-cache",
        "Content-Type": "application/json",
        Authorization: `Bearer blah ~`,
        "Access-Control-Allow-Origin": "*",
      }
    }
    axios.post(url, data, config)
      .then(res => {
        alert(JSON.stringify(res.data))
        router.push("./login")
      })
  }
  const handleCancel = () => {
    alert('Ok, back to main..');
  }

  return (<>
    <div className="container">
      <h1>개인 페이지~!!!!!</h1>
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr />   <br />

      <label htmlFor="memId"><b>ID</b></label><br />
      <input type="text" placeholder="Enter ID" name="id" onChange={handleMemId} required />
      <br /><br />
      <label htmlFor="memPw"><b>Password</b></label><br />
      <input type="password" placeholder="Enter Password" name="memPw" onChange={handleMemPw} required />
      <br /><br />
      <label htmlFor="name"><b>NAME</b></label><br />
      <input type="text" placeholder="Enter name" name="name" onChange={handleName} required />
      <br /><br />
      <label htmlFor="phone"><b>phone</b></label><br />
      <input type="text" placeholder="Enter phone" name="phone" onChange={handlePhone} required />
      <br /><br />
      <label htmlFor="job"><b>job</b></label><br />
      <input type="text" placeholder="Enter job" name="job" onChange={handleJob} />
      <br /><br />
      <label htmlFor="height"><b>height</b></label><br />
      <input type="text" placeholder="Enter height" name="height" onChange={handleHeigtht} />
      <br /><br />
      <label htmlFor="weight"><b>weight</b></label><br />
      <input type="text" placeholder="Enter weight" name="weight" onChange={handleWeigtht} />
      <br /><br />

      <label>
        <input type="checkbox" checked={true} name="remember" style={{ marginBottom: '15px' }} /> Remember me
      </label>

      <p>By creating an account you agree to our <a href="#" style={{ color: 'dodgerblue' }}>Terms & Privacy</a>.</p>
      <br />
      <div className="clearfix">
        <button type="button" className="cancelbtn" onClick={handleCancel}>Cancel</button><br />
        <button type="submit" className="signupbtn" onClick={handleSubmit}>Sign Up</button>
      </div>
    </div>
  </>)
}