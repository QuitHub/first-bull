import com.monovore.decline._

object FirstBull extends CommandApp(BullCommand.command) {

  val timestamp: Long = System.currentTimeMillis()
  val baseUrl = "https://api.binance.com/api/v3/order"
  val testUrl = s"$baseUrl/test"



  def app(input: (String, String, String, Double, Boolean)): Unit = {
    val (coin, apiKey, secret, quoteOrderQty, realMoney) = input

    println(coin)

  }


}
