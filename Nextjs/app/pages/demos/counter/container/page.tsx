
import { decrease, increase } from "@/lib/features/counter/counterReducer"
import { useCallback } from "react"
import { useDispatch } from "react-redux"
import { useSelector } from "react-redux"
import ConterComponent from "../component/page"

const CounterContainer = () => {
const count = useSelector ((state:any) => (state.CounterContainer.count))
const dispatch = useDispatch()
const handlePlus = useCallback(()=> dispatch(increase()),[dispatch]);
const handleMinus = useCallback(()=> dispatch(decrease()),[dispatch]);
return(<>
<ConterComponent count={count} handlePlus={handlePlus} handleMinus={handleMinus}/>

</>)
}
export default CounterContainer
