import cats.implicits._
import com.monovore.decline.{Command, Opts}

object BullCommand {
  val coin = Opts.option[String]("coin", help = "Crypto coin to buy")
  val apiKey = Opts.option[String]("apiKey", help = "Binance api key")
  val secret = Opts.option[String]("secret", help = "Binance secret")
  val quoteOrderQty = Opts.option[Double]("quoteOrderQty", help = "Crypto coin to buy").withDefault(0.0001)
  val realMoney = Opts.flag("realMoney", help = "use real money in binance").orFalse

  val options: Opts[Unit] = (coin, apiKey, secret, quoteOrderQty, realMoney).mapN {
    FirstBull.app(_, _, _, _, _)
  }

  val command = Command[Unit]("first-bull", "Will buy and sell super fast during a Binance pump!", false)(options)

}
