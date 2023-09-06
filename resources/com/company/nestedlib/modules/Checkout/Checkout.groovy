if( CFG.'git.url' ){
  MPLModule('Git Checkout', CFG)
  println "[Nested Shared Library] : If block in Checkout.groovy "
}
else{
  println "[Nested Shared Library] : Else block in Checkout.groovy "
  MPLModulePostStep {
    println "[Nested Shared Library] : Module POST step from Checkout.roovy "
  }  
  MPLModule('Default Checkout', CFG)
}
