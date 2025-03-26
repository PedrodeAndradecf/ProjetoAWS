'use client';
import { useEffect, useState } from "react";



export default function GameItem(props) {
  const updateAll = () => {
    document.getElementById("NOME").innerHTML = "<h1>" + props.name + "</h1>";
    document.getElementById("PUBLISHER").innerHTML = "<p>" + props.publisher + "</p>";
    document.getElementById("DEVELOPER").innerHTML = "<p>" + props.developer + "</p>";
    document.getElementById("DESCRIPTION").innerHTML = "<p>" + props.description+ "</p>";
    document.getElementById("FilterSection").style.backgroundImage = "url(" + props.image +")"
    document.getElementById("PLATAFORM").innerHTML = "<p>" + props.plataform+ "</p>";
  }


  return (
      <div className="GameItem"  style={{backgroundImage: `url(${props.image})`}} onMouseOver={() => updateAll(props)}> 
      </div>
  
    );
  }
  