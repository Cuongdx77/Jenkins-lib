  def call(Map config = [:]) {
    test(name: 'test.sh')
    sh "./test.sh ${config.name} ${config.dayOfWeek}"
  }
