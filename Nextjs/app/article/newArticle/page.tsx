'use client'

import axios from "axios"

interface IArticle {
    id : number,
    title : string,
    content : string,
    writer : string,
    registerDate : string
}

const Article = (props: IArticle) => {
    return(
        <tr key={props.id}>
            <td>{props.title}</td>
            <td>{props.content}</td>
            <td>{props.writer}</td>
            <td>{props.registerDate}</td>
        </tr>
    )
}

const SERVER = 'http://localhost:8080'

export default function newArticle() {
    const url = `${SERVER}/api/login`
    const config = {
        headers: {
            "Cache-Control": "no-cache",
            "Content-Type": "application/json",
            Authorization: `Bearer blah ~`,
            "Access-Control-Allow-Origin": "*",
        }}
        
axios.get(url,config)
.then(res=>{
    const response = res.data.messenge
        alert((response)) 
        if (response === 'SUCCESS') {
            alert("게시글이 있습니다.");
        } else if (response === 'FAIL') {
            alert("게시글이 없습니다.");
        } else {
            alert("지정되지 않은 값");
        }

})


    const articles = [
        { id: 0, title:'',content:'',writer:'',registerDate:''}
    ]
    const articleMap = articles.map((v,i)=>(<Article {...v}/>))

    return (<>
        <h2>개인페이지 Article</h2>
        <table border={1}>
            <thead>
                <tr>
                <th>title</th>
                <th>content</th>
                <th>writer</th>
                <th>registerDate</th>
                </tr>
            </thead>
            <tbody>
                {articleMap}
            </tbody>
        </table>
    </>)
}