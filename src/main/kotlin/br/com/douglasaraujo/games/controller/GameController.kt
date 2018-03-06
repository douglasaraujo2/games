package br.com.douglasaraujo.games.controller

import br.com.douglasaraujo.games.model.Game
import br.com.douglasaraujo.games.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/game")
class  GameController{

    @Autowired
    lateinit var gameService: GameService


    @GetMapping
    fun buscarTodos(): List<Game>{
        return gameService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game: Game){
        gameService.salvar(game)
    }

    @GetMapping(value = "/Titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo") titulo: String): List<Game>{
        return gameService.buscarPor(nome = titulo)
    }

    @DeleteMapping(value = "{id}")
    fun remover(@PathVariable(value = "id") id: String){
        gameService.remover(id)
    }

}