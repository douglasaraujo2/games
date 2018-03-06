package br.com.douglasaraujo.games.model
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Game(@Id var id: String? = null,
                var nome: String,
                var urlImagem: String,
                var anoLancamento: Integer)