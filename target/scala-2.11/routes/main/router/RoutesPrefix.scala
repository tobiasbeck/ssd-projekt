
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tobibeck/htdocs/ssd-project/conf/routes
// @DATE:Thu May 18 13:37:01 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
