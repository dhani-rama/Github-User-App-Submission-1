package id.research.githubuserapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import id.research.githubuserapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mMainBinding: ActivityMainBinding
    private lateinit var mUsers: ArrayList<UsersEntity>
    private lateinit var mUsersGithubAdapter: UsersGithubAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mMainBinding.root)

        mUsersGithubAdapter = UsersGithubAdapter()
        mUsers = arrayListOf<UsersEntity>()

        showList()
    }

    private fun showList() {

        mUsers.addAll(UsersData.listData)
        mUsersGithubAdapter.setListUsers(mUsers)

        with(mMainBinding.rvUser) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = mUsersGithubAdapter
        }
    }
}