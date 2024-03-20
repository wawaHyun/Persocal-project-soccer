'use client';
import { useState } from "react";
import axios from 'axios';

const SERVER = 'http://localhost:8080'

export default function login() {
    const [userName, setUserName] = useState('')
    const [pw, setPw] = useState('')

    const onChangeUserName = (e: any) => {
        setUserName(e.target.value);
    }
    const onChangePw = (e: any) => {
        setPw(e.target.value);
    }

    const handleSubmit = () => {
        alert('Login ' + userName + " " + pw + '!!');
        const url = `${SERVER}/userName,pw`
        const data = { userName, pw }
        const config = {
            headers: {
                "Cache-Control": "no-cache",
                "Content-Type": "application/json",
                Authorization: `Bearer blah ~`,
                "Access-Control-Allow-Origin": "*"
            }
        }
        axios.post(url, data, config)
            .then(res => (
                alert("userPost가 가져왔다네 " + JSON.stringify(res.data))
            ))
    }


    return <>
        <div>
            <h2>LOGIN! </h2>
            <h3>ID</h3>
            <input type="text" onChange={onChangeUserName} />

            <h3>PW</h3>
            <input type="text" onChange={onChangePw} /><br /><br />

            <button onClick={handleSubmit}>input</button><br />
        </div>
    </>;
} 