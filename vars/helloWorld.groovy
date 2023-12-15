def runPythonScript() {
    def workspacePath = env.WORKSPACE
    sh "python ${workspacePath}/myscript.py"
}
