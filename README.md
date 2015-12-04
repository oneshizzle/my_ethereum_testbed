# my_ethereum_testbed

I'm interest in block chain, so I have decided to have a go with Ethereum. This initial project, I am limiting the framework

My local dev environment uses geth as the EVM (Ethereum Virtual Machine)

The asumption is that geth has been installed on a Windows machine (using chocolatey). 

.\geth.exe --networkid=7674482150 --rpc --rpcaddr="localhost" --unlock=0 --rpcport="8585" --rpccorsdomain="http://meteor-dapp-cosmo.meteor.com" --maxpeers=0 console

Starting GETH this way allows me to write (and deploy?? not completed as yet not enough gas) the contracts from UI. 

The application code is straight foward so far. 
Communicate to geth via web service calls using GSON

The ultimate goal is to create a form of Swap product.
Utilizing the Yahoo Finance webservice call to retrieve a price, and update a contract with that price.
And the contract acts (or doesnt act) based on the change. 

The first version of the Swap would be a straight fwd execution exchange, on this price pay this guy this money,
or may be just a bet (like an option). 

