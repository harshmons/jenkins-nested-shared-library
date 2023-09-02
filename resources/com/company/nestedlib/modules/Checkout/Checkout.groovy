if( CFG.'git.url' )
  MPLModule('Git Checkout', CFG)
else
  echo "I am from Chekcout Nested lib"
  MPLModule('Default Checkout', CFG)
