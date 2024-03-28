package com.example.globoplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pagina_inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_inicial)

        val napoleao = findViewById<ImageView>(R.id.napoleao)
        val avatar = findViewById<ImageView>(R.id.avatar)
        val aquaman = findViewById<ImageView>(R.id.aquaman)
        val teenwolf = findViewById<ImageView>(R.id.teenwolf)
        val b99 = findViewById<ImageView>(R.id.brooklyn)
        val barbie = findViewById<ImageView>(R.id.barbie)
        val oppe = findViewById<ImageView>(R.id.oppen)
        val pobre = findViewById<ImageView>(R.id.pobres)
        val gossip = findViewById<ImageView>(R.id.gossip)

        napoleao.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.napoleao)
                putExtra("titulo", "NAPOLEÃO")
                putExtra(
                    "Enredo",
                    "As origens do comandante militar Napoleão e sua rápida ascensão. Uma visão através do prisma de seu relacionamento e muitas vezes volátil com sua esposa e por ser amor verdadeiro, Josephine."
                )
                startActivity(intent)
            }
            avatar.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.avatar)
                    putExtra("titulo", "AVATAR")
                    putExtra(
                        "Enredo",
                        "No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser primitivos, mas são altamente evoluídos. Como o ambiente do planeta é tóxico, foram criados os avatares, corpos biológicos controlados pela mente humana que se movimentam livremente em Pandora."
                    )
                }

                startActivity(intent)
            }
            aquaman.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.aquaman)
                    putExtra("titulo", "AQUAMAN")
                    putExtra(
                        "Enredo",
                        "A cidade de Atlantis, que já foi lar de uma das mais avançadas civilizações do mundo, agora é um reino submerso dominado pelo ganancioso Rei Orm. Com um vasto exército a seu dispor, Orm planeja conquistar tanto os demais reinos do oceano, quanto o mundo da superfície."
                    )
                }

                startActivity(intent)
            }
            teenwolf.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.teenwolf)
                    putExtra("titulo", "TEEN WOLF")
                    putExtra(
                        "Enredo",
                        "O jovem Scott McCall (Tyler Posey) é estudante do ensino médio no colégio fictício de Beacon Hills e vive como um garoto comum, passando por problemas naturais da juventude. Ao ir caminhar na floresta em busca de um suposto corpo morto, o menino é mordido por um lobisomem."
                    )
                }

                startActivity(intent)
            }
            b99.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.brooklyn)
                    putExtra("titulo", "Brooklyn Nine-Nine")
                    putExtra(
                        "Enredo",
                        "A série Brooklyn Nine-Nine é ambientada na 99ª Delegacia de Polícia de Nova York, no Brooklyn, acompanhando as maluquices do imaturo detetive Jake Peralta (Andy Samberg) e a relação que ele tem com o novo capitão, Ray Holt (Andre Braugher)."
                    )
                }

                startActivity(intent)
            }
            barbie.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.barbie)
                    putExtra("titulo", "Barbie")
                    putExtra(
                        "Enredo",
                        "Barbie começa a ter pensamentos estranhos e sua aparência muda, então ela parte para o mundo real com Ken para tentar encontrar uma solução e voltar a ser uma boneca perfeita."
                    )
                }

                startActivity(intent)
            }
            oppe.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.oppenheimer)
                    putExtra("titulo", "Oppenheimer")
                    putExtra(
                        "Enredo",
                        "O físico J. Robert Oppenheimer trabalha com uma equipe de cientistas durante o Projeto Manhattan, levando ao desenvolvimento da bomba atômica."
                    )
                }

                startActivity(intent)
            }
            pobre.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.pobres)
                    putExtra("titulo", "Pobres Criaturas")
                    putExtra(
                        "Enredo",
                        "A jovem Bella Baxter é trazida de volta à vida pelo cientista Dr. Godwin Baxter. Querendo ver mais do mundo, ela foge com um advogado e viaja pelos continentes. Livre dos preconceitos de sua época, Bella exige igualdade e libertação."
                    )
                }

                startActivity(intent)
            }
            gossip.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.gossip_girl)
                    putExtra("titulo", "Gossip Girl")
                    putExtra(
                        "Enredo",
                        "Manhattan... uma escola de adolescentes ricos, com poucas coisas verdadeiramente importantes das quais se ocupar e todo o tempo do mundo para explorar as tentações da cidade. O ambiente perfeito para o império da intriga... a série conta a vida de um grupo de jovens milionários através dos olhos de uma blogger, que sabe tudo o que acontece nas suas vidas, mas que ninguém sabe quem é."
                    )
                }
            }
        }
    }
}


