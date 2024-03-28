'use client';
import Button from "@mui/material/Button";
import { useState } from "react";


export default function Counter(){
    const [num, setNum] = useState(0)

    const handlePlus=() =>{
        setNum(num+1);
    }
    const handleMinus=() =>{
        setNum(num-1);
    }
    return (<>
    <h1>test!</h1>
    <h1>Counter : {num}</h1>
    <Button onClick={handlePlus}>+</Button>
    <Button onClick={handleMinus}>-</Button> 
    </>)
}