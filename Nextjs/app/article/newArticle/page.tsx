'use client'

import axios from "axios"
import { useRouter } from "next/navigation"
import { useEffect, useState } from "react"

interface IArticle {
    id: number,
    title: string,
    content: string,
    writer: string,
    registerDate: string
}
const SERVER = 'http://localhost:8080'

export default function NewArticle() {
    const router = useRouter();
    const [articles, setArticles] = useState([]);

    const url = `${SERVER}/api/articles`
    const config = {
        headers: {
            "Cache-Control": "no-cache",
            "Content-Type": "application/json",
            Authorization: `Bearer blah ~`,
            "Access-Control-Allow-Origin": "*",
        }
    }

    useEffect(() => {
        axios.get(url, config)
            .then(res => {
                const response = res.data.message
                console.log((response))
                if (response === 'SUCCESS') {
                    
                    for (const i of res.data.result) {
                        console.log("전체 : ", i);
                        setArticles(res.data.result);
                    }


                } else if (response === 'FAIL') {
                    alert("게시글이 없습니다.")
                } else {
                    alert("지정되지 않은 값")
                }
                // router.push;
            })

    }, []);

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
                {articles.map((props: IArticle) => (
                    <tr key={props.id}>
                        <td>{props.title}</td>
                        <td>{props.content}</td>
                        <td>{props.writer}</td>
                        <td>{props.registerDate}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    </>)
}