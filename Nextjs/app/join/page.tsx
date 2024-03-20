'use client';

import { useState } from "react";

export default function join(){
    const {memId, memPW, memPwRe, name, phone,address,job,height, weight} = useState('')
   
   return <>
    <div>
        <h2>JOIN us!</h2>
        <h3>join을 시작합니다.</h3><input type="text" /><br />
        <h3>memId</h3>
        <h3>memPW</h3>
        <h3>comfirm PW</h3>
        <h3>name</h3>
        <h3>phone</h3>
        <h3>address</h3>
        <h3>job</h3>
        <h3>height</h3>
        <h3>weight</h3>
        <button onClick={}>JOIN</button>
    </div>
    </>
}