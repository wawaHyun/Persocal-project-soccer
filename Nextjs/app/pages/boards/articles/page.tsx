'use client'

import {useSelector,useDispatch} from 'react-redux'
import { useRouter } from "next/navigation"
import { useEffect, useState } from "react"
import { NextPage } from "next";
import { IArticle } from "@/redux/features/articles/article.model";
import { getAllArticles } from "@/redux/features/articles/article.service";

const ArticlesPage:NextPage =()=> {
    const router = useRouter();
    const dispatch = useDispatch();
    const [articles, setArticles] = useState([]);

    useEffect(() => {
        dispatch(getAllArticles())
    }, []);

    return (<>
        <h2>개인페이지 All Article page</h2>
        <table border={1} color="white">
            <thead>
                <tr>
                    <th>title</th>
                    <th>content</th>
                    <th>writer</th>
                    <th>registerDate</th>
                </tr>
            </thead>
            <tbody>
                {/* {getAllArticles((props: IArticle) => (
                    <tr key={props.id}>
                        <td>{props.title}</td>
                        <td>{props.content}</td>
                        <td>{props.writer}</td>
                        <td>{props.registerDate}</td>
                    </tr>
                ))} */}
            </tbody>
        </table>
    </>)
}

export default ArticlesPage;