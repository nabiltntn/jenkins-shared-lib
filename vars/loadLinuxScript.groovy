def call(Map config = [:]) {
  def scriptContent = libraryResource "com/nz/scripts/linux/${config.name}
  writeFile file : "./${config.name}", text: ${scriptContent}
  sh "chmod a+x ./${config.name}"
}
