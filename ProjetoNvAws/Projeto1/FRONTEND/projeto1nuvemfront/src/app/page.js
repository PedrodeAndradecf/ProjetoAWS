'use client'
import Image from "next/image";
import styles from "./page.module.css";
import GameItem from "../Components/GameItem/GameItem";
import { useEffect, useState } from "react";
import Details from "../Components/Details/Details";





export default function Home() {
  const [games, setGames] = useState([]);
  const [detail, setDetail] = useState([]);

  
  const getGames = () => {
    fetch("http://127.0.0.1:8080/games").then((rsp) => rsp.json()).then((data) => {
      console.log(data);
      setGames(data);
    })

  }


  
  useEffect(getGames, []);
  useState(setDetail, [{}]);
  
  return (

    <div className="FullView">
      <div className="NavBar">
        <div className="PageTitle">
        <p>GAMEBOXD</p>
        </div>
      </div>
      <div className="ShowSection">
        <div className="GamesSection" id="GamesSection">
          {games.map(game =>(
            <GameItem image={game.image} name={game.name} description={game.description} publisher={game.publisher} developer={game.developer} plataform={game.plataform}/>
          ))} 
        </div>

        <Details/>

        

      </div>
    </div>

  );
}
