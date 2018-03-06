package br.com.douglasaraujo.games.repository

import br.com.douglasaraujo.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository: MongoRepository<Game,String>{

    fun findByNomeIgnoreCaseContaining(nome:String): List<Game>
}