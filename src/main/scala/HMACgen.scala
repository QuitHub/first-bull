import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

object HMACgen {
    def generateHMAC(sharedSecret: String, preHashString: String): String = {
      val secret = new SecretKeySpec(sharedSecret.getBytes, "SHA256")   //Crypto Funs : 'SHA256' , 'HmacSHA1'
      val mac = Mac.getInstance("SHA256")
      mac.init(secret)
      val hashString: Array[Byte] = mac.doFinal(preHashString.getBytes)
      new String(hashString.map(_.toChar))
    }
}
