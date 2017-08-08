sdkmanCliVersion = '5.5.10'
environments {
    local {
        sdkmanLegacyApi = 'http://localhost:8080/1'
        sdkmanCurrentApi = 'http://localhost:8080/2'
    }
    production {
        sdkmanLegacyApi = 'https://api.sdkman.io/1'
        sdkmanCurrentApi = 'https://api.sdkman.io/2'
    }
}
