package fr.sissi.shoppingsecretdream

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.sissi.shoppingsecretdream.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //charge le ProductRepository et avoir un nouvel objet à partir de cette class
        val repo = ProductRepository()

        //met à jour la liste des produits une fois les données récupérées
        repo.updateData {

            //injecte le fragment dans la boite (framelayout, (fragment_container) dans activity_main)
            //val stocke une valeur qui ne changera pas
            //supportFragmentManager permet de manipuler les fragments sur Android
            //beginTransaction série d'opération pour manipuler les fragments, donne de la dynamique
            val transaction = supportFragmentManager.beginTransaction()

            //permet de remplacer le fragment_container vide de la page d'accueil par le home_fragment
            // this = place le context
            transaction.replace(R.id.fragment_container, HomeFragment(this))

            //empêche d'avoir un retour sur ce composant
            transaction.addToBackStack(null)

            //envoie les changements
            transaction.commit()

        }
        }

    }

