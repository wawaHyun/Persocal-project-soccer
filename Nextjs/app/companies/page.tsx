
'use client'

import axios from "axios"
import { Main } from "next/document"
import { useRouter } from "next/navigation"
import { stringify } from "querystring"
import { useState } from "react"

interface ICompany{
    id : number,
    company : string,
    contact: string,
    country: string
}

const Company = (props: ICompany) => {
    return (
        <tr key={props.id}>
            <td>{props.company}</td>
            <td>{props.contact}</td>
            <td>{props.country}</td>
        </tr>
    );
};

export default function Companies() {

    const Companies = [
        {id:0,company : 'Alfreds Futterkiste',contact :'Maria Anders',country :'Germany' },
        {id:1,company : 'Centro comercial Moctezuma',contact :'Francisco Chang',country :'Mexico' },
        {id:3,company : 'Ernst Handel',contact :'Roland Mendel',country :'Austria' },
        {id:4,company : 'Island Trading',contact :'Helen Bennett',country :'UK' }
    ]
    
    const companyMap = Companies.map((v,i) => (<Company key={i} {...v} />))    
    

    return (
        <>
            <h3>Articles</h3>

            <table>
                <thead>
                <tr>
                    <th>Company</th>
                    <th>Contact</th>
                    <th>Country</th>
                </tr>
                </thead>
                <tbody>
                {companyMap}
                </tbody>
            </table>
        </>

    )
}