package id.research.githubuserapp

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.research.githubuserapp.databinding.ItemUserBinding

class UsersGithubAdapter : RecyclerView.Adapter<UsersGithubAdapter.listUserHolderView>() {

    private var listUsers = ArrayList<UsersEntity>()

    fun setListUsers(listUsers: ArrayList<UsersEntity>?) {
        if (listUsers == null) return
        this.listUsers.clear()
        this.listUsers.addAll(listUsers)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): listUserHolderView {

        val itemUsersBinding =
            ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return listUserHolderView(itemUsersBinding)
    }

    override fun onBindViewHolder(holder: listUserHolderView, position: Int) {
        val usersGithub = listUsers[position]
        holder.bind(usersGithub)
    }

    override fun getItemCount(): Int {
        return listUsers.size
    }

    class listUserHolderView(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(usersItem: UsersEntity) {
            with(binding) {
                tvName.text = usersItem.name
                tvUsername.text = usersItem.username

                Glide.with(itemView.context)
                    .load(usersItem.photo)
                    .apply(RequestOptions().override(48, 48))
                    .into(imgUser)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailUsersGithubActivity::class.java)
                        .apply {
                            putExtra(Constants.USERS, usersItem)
                        }
                    itemView.context.startActivity(intent)
                    (itemView.context as Activity).finish()
                }
            }
        }
    }
}