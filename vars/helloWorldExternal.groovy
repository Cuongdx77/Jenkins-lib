def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.py')
    sh "python3 ./hello-world.py"
}
