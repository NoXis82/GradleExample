import model.MessageModel
import org.apache.commons.lang3.StringUtils

class Service {
    companion object {
        fun printMessage() {
            val model = MessageModel()
            val message = StringUtils.trimToEmpty(model.geMessage())
            println(message)
        }
    }

}