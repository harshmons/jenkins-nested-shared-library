def call() {
  // Using the MPL library and adding the custom path to find modules
  library('mpl')
  MPLModulesPath('com/company/nestedlib')
  echo "From MPLInit file call method"
  MPLPipeline{}
}
