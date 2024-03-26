'use client';

import { useState } from "react";
import axios from 'axios';
import Link from "next/link";

const SERVER = 'http://localhost:8080'

export default function Home() {
  const [name,setName] = useState('')

  const handlechange = (e:any)=>{
    setName(e.target.value);
    }
  
  const handleClik = ()=>{
    alert('welcome '+name+'!!');
    const url = `${SERVER}/name`
    const data = {'name': name}
    const config = {
      headers:{
        "Cache-Control": "no-cache",
        "Content-Type": "application/json",
         Authorization: `Bearer blah ~` ,
        "Access-Control-Allow-Origin": "*",
    }}
    axios.post(url, data, config)
    .then(res=>(
      alert("리스핀스가 가져온 이름 : "+JSON.stringify(res.data))
    ))
    }
  return <>
  <h1>개인 page!!!!!!!!</h1>
<div>enter your name.</div><br />
<input type="text" onChange={handlechange}/><br />
<button onClick={handleClik}>input</button>
<br /><br />
<Link href ={"/login"}>로그인</Link><br /><br />
<Link href={"/join"}>join</Link><br /><br />
<Link href={"/article/newArticle"}>newArticle</Link><br /><br />
</>
}
