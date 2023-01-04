package fr.sissi.shoppingsecretdream

import java.io.FileDescriptor
import java.net.URL

//les () permettent de lister et donner toutes les carcatéristique d'un produit
class ProductModel (
    //titre avec une valeur par défaut
    val name: String = "Massage",
    //descrition avec valeur par défaut
    val description: String = "Petite description",
    //lien image
    val imageURL: String = "https://images.unsplash.com/photo-1542848284-8afa78a08ccb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1286&q=80",
    //variable qui peut changer lors de l'exécution du programme sur produit liké ou non
    //par défaut le produit est non liké
    var liked : Boolean = false
        )
