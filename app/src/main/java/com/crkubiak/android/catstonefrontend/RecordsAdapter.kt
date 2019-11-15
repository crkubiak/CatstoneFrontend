package com.crkubiak.android.catstonefrontend

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cat_row.view.*

class RecordsAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val locations = listOf("3020 S Haynes",
        "3877 Coit Ave NE",
        "25 E Washington St",
        "44338 W Eddie Way",
        "Loomis & Fuller",
        "Halsted & Madison",
        "Division & Fulton",
        "Division & 54th St",
        "1610 N Bethany Home",
        "31st St & Halsted",
        "Division & Damen",
        "Milwaukee & Grand",
        "North & Ashland",
        "711 S Ashland Ave",
        "2020 Vision",
        "4747 S Western",
        "Clark & Lake")

    val comments = listOf("That's a fine looking cat",
        "Wow a cat",
        "Hey another cat",
        "Did you know that was a cat?",
        "Wait wait don't tell me... cat",
        "Meow meow meow meow",
        "Woem woem woem woem",
        "Try pronouncing hoMEOWner right",
        "A cat deserves a comment",
        "Here kitty kitty",
        "Where's the cat?",
        "Tell me the cat's name?",
        "Skip... Skippy? Skippy!",
        "What color was it?!",
        "Cats! Cats! Cats!",
        "Petey & Todd & Moe & Alita",
        "Eggs & Benedict & Pokey & Hammie & Bagel & Hashbrowns & Padre & Muffin")

    override fun getItemCount(): Int {
        return locations.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.cat_row, parent, false)
        return CustomViewHolder((cellForRow))
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val location = locations.get(position)
        holder.view.cat_row_location_text_view.text = location

        val comment = comments.get(position)
        holder.view.cat_row_comment_text_view.text = comment
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}