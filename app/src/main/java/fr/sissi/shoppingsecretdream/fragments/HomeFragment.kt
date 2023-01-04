package fr.sissi.shoppingsecretdream.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.sissi.shoppingsecretdream.MainActivity
import fr.sissi.shoppingsecretdream.ProductRepository.Singleton.productList
import fr.sissi.shoppingsecretdream.R
import fr.sissi.shoppingsecretdream.adapter.ProductAdapter
import fr.sissi.shoppingsecretdream.adapter.ProductItemDecoration

//classe qui contient toutes les fonctions avec le code de l'application
class HomeFragment (
    private val context: MainActivity
): Fragment(

) {

//charge le recyclerView qui contient l'adapter

    //fonction qui contient le code qui va permettre d'injecter le layout fragmentHome
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //injection de la vue
        val view = inflater?.inflate(R.layout.fragment_home, container,false)

        //créer une liste qui va stocker les produits
        //val productList = arrayListOf<ProductModel>()

        //récupération de la vue du recyclerView horizontal

        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        //les produits se chargent automatiquement
        //je précise quel layout je veux utiliser --> ProductAdapter avec juste un id
        horizontalRecyclerView.adapter = ProductAdapter( context,productList, R.layout.item_horizontal_product)

        //récupération du second récycler view vertical
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        //je précise quel layout je souhaite et lui donne l'adapter
        verticalRecyclerView.adapter = ProductAdapter(context, productList, R.layout.item_vertical_product)
        //mise en place du offSet ProductItemDecoration pour l'espace vertical des composants
        verticalRecyclerView.addItemDecoration(ProductItemDecoration())



//création de la vue
        //injecte le layout associé sur homeFragment
        //.inflate = action d'injecter le layout
        return view
}

}