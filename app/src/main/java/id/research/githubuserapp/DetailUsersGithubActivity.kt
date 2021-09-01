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

        with(mDetailBinding) {
            tvName.text = intent.getStringExtra(Constants.NAME)
            tvFirstUsername.text = intent.getStringExtra(Constants.USERNAME)
            tvSecondUsername.text = intent.getStringExtra(Constants.USERNAME)
            tvValueFollowers.text = intent.getStringExtra(Constants.FOLLOWERS)
            tvValueFollowing.text = intent.getStringExtra(Constants.FOLLOWING)
            tvValueRepository.text = intent.getStringExtra(Constants.REPOSITORY)
            tvCity.text = intent.getStringExtra(Constants.CITY)
            tvProvince.text = intent.getStringExtra(Constants.PROVINCE)
            tvCompany.text = intent.getStringExtra(Constants.COMPANY)
            imgUser.setImageResource(intent.getIntExtra(Constants.PHOTO, 0))
        }

    }
}