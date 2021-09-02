package id.research.githubuserapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.research.githubuserapp.databinding.ActivityDetailUsersGithubBinding

class DetailUsersGithubActivity : AppCompatActivity() {

    private lateinit var mDetailBinding: ActivityDetailUsersGithubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDetailBinding = ActivityDetailUsersGithubBinding.inflate(layoutInflater)
        setContentView(mDetailBinding.root)

        mDetailBinding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val users = intent.getParcelableExtra<UsersEntity>(Constants.USERS) as UsersEntity

        with(mDetailBinding) {
            tvName.text = users.name
            tvFirstUsername.text = users.username
            tvSecondUsername.text = users.username
            tvValueFollowers.text = users.followers
            tvValueFollowing.text = users.following
            tvValueRepository.text = users.repository
            tvLocation.text = users.location
            tvCompany.text = users.company
            imgUser.setImageResource(users.photo)
        }

    }
}