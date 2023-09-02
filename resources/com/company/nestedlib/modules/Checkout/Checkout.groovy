if( CFG.'git.url' )
  MPLModule('Git Checkout', CFG)
else{
  echo "I am from Chekcout Nested lib"
MPLModulePostStep {
  echo "I am from Post step"
}  
MPLModule('Default Checkout', CFG)
}
