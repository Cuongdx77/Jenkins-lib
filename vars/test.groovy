  def call(Map config = [:]) {
    loadLinuxScript(name: 'test.sh')
    sh "./test.sh"
  }
