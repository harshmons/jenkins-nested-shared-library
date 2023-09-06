def call() {
  // Using the MPL library and adding the custom path to find modules
  library('mpl')
  MPLModulesPath('com/company/nestedlib')
  println "[Nested Shared Library] : From MPLInit.groovy "
  MPLPipeline{}
}
