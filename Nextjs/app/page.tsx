'use client';

import { useState } from "react";
import axios from 'axios';
import Link from "next/link";
import './globals.css'
const SERVER = 'http://localhost:8080'

export default function Home() {
  const [name, setName] = useState('')

  const handlechange = (e: any) => {
    setName(e.target.value);
  }

  const handleClik = () => {
    alert('welcome ' + name + '!!');
    const url = `${SERVER}/name`
    const data = { 'name': name }
    const config = {
      headers: {
        "Cache-Control": "no-cache",
        "Content-Type": "application/json",
        Authorization: `Bearer blah ~`,
        "Access-Control-Allow-Origin": "*",
      }
    }
    axios.post(url, data, config)
      .then(res => (
        alert("리스핀스가 가져온 이름 : " + JSON.stringify(res.data))
      ))
  }

  return <>
  <div className='text-center'>

    <h1>개인 page!!!!!!!!</h1>
    <div className="text-pink-500" >enter your name.</div>
    <input type="text" onChange={handlechange} className=" rounded-lg flex-1 appearance-none border
     border-black w-500 py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-bm text-base focus:outline-none focus:ring-2
      focus:ring-purple-600 focus:border-transparent"/><br />
    <hr />
    <button onClick={handleClik} >input</button>
    <button onClick={handleClik} >input</button>
    <br /><br />
    <Link href={"/login"}>로그인</Link><br /><br />
    <Link href={"/mui-demo"}>mui demo</Link><br /><br />
    <Link href={"/join"}>join</Link><br /><br />
    <Link href={"/companies"}>companies</Link><br /><br />
    <Link href={"/article/newArticle"}>newArticle</Link><br /><br />
  </div>
  </>
}
