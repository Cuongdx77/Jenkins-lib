def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.py')
    sh "python ./hello-world.py"
}
