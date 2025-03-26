export default function GameItem(props) {
  
    return (
        <div className="FilterSection" id="FilterSection">
        <h1 id="NOME">a</h1>
        <h2>PUBLISHER:</h2><p id="PUBLISHER">{props.publisher}</p>
        <h2>DEVELOPER:</h2><p  id="DEVELOPER">{props.developer}</p>
        <h2>GAME DESCRIPTION</h2>
        <p  id="DESCRIPTION">{props.description}</p> 
        <h2>PLATAFORM:</h2><p  id="PLATAFORM">{props.plataform}</p>
      </div>
    
      );
    }
    