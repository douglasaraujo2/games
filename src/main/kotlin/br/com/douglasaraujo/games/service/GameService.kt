package br.com.douglasaraujo.games.service

import br.com.douglasaraujo.games.model.Game
import br.com.douglasaraujo.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class GameService{

    @Autowired
    lateinit var gameRepository: GameRepository

    fun buscarTodos() : List<Game> {

        return  gameRepository.findAll()

    }

    fun salvar(game : Game){

        gameRepository.save(game)

    }

    fun getById(id:String): Optional<Game> {
        return gameRepository.findById(id)
    }

    fun buscarPor(nome: String): List<Game>{
        return gameRepository.findByNomeIgnoreCaseContaining(nome)
    }

    fun remover(id: String) {
        gameRepository.deleteById(id) 
    }
}