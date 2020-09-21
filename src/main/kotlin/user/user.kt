package c.s.sample.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

open class User {
     var username: String? = null

    var nickname: String? = null

    var sex: String? = null

    val age: Int by lazy {
        18
    }

    

// lateinit 只作用于 var
// by lazy 作用于 val

}


interface UserService {
    fun getUser(): User

    @JvmDefault
    fun userName(user:User):String = "${user.nickname} ${user.username}"
}

@Service
class UserServiceImpl : UserService {
    override fun getUser(): User {
        return User().let {
            it.sex = "male"
            it.nickname = "zs"
            it.username = "zhangsan"
            it
        }
    }
}

//@RestController
//class UserController(private val userService: UserService) {
//    @GetMapping("/get/one")
//    fun getOne(): User {
//        return userService.getUser()
//    }
//}

@RestController
class UserController{
    @Autowired
   lateinit var userService: UserService;

    @GetMapping("/get/one")
    fun getOne(): User {
        return userService.getUser()
    }
}