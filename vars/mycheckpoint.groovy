def call(Map config, Object script) {
    stage('Library stage') {
        script.checkpoint 'My checkpoint'
    }
}