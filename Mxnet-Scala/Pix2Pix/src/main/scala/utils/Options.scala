package utils

import org.kohsuke.args4j.Option

/**
 * @author Depeng Liang
 */
object Options {

  class OptTrain {
    @Option(name = "--data-path", usage = "the image data path")
    var dataPath: String = null
    @Option(name = "--scalesize", usage = "scale images to this size")
    var scaleSize: Int = 286
    @Option(name = "--cropsize", usage = "crop images to this size")
    var cropSize: Int = 256
    @Option(name = "--ngf", usage = "of gen filters in first conv layer")
    var ngf: Int = 64
    @Option(name = "--ndf", usage = "of discrim filters in first conv layer")
    var ndf: Int = 64
    @Option(name = "--input-nc", usage = "of input image channels")
    var inputNC: Int = 3
     @Option(name = "--output-nc", usage = "of output image channels")
    var outputNC: Int = 3
    @Option(name = "--niter", usage = "of iter at starting learning rate")
    var niter: Int = 400
    @Option(name = "--lr", usage = "the initial learning rate for adam")
    var lr: Float = 0.0002f
    @Option(name = "--beta1", usage = "momentum term of adam")
    var beta1: Float = 0.5f
    @Option(name = "--flip", usage = "if flip the images for data argumentation, 1 means flip 0 means not")
    var flip: Int = 1
    @Option(name = "--display-freq", usage = "display the current results every display_freq iterations")
    var displayFreq: Int = 50
    @Option(name = "--save-epoch-freq", usage = "save a model every save_epoch_freq epochs (does not overwrite previously saved models)")
    var saveEpochFreq: Int = 1
    @Option(name = "--save-latest-freq", usage = "save the latest model every latest_freq sgd iterations (overwrites the previous latest model)")
    var saveLatestFreq: Int = 1000
    @Option(name = "--print-freq", usage = "print the debug information every prinFreq iterations")
    var printFreq: Int = 50
    @Option(name = "--checkpoints-dir", usage = "models are saved here")
    var checkpointsDir: String = "./models/checkpoints"
    @Option(name = "--lambda", usage = "weight for L1 loss")
    var lambda: Float = 100f
    @Option(name = "--gpu", usage = "which gpu card to use 0,1,2, default is -1, means using cpu")
    var gpu: Int = -1
    @Option(name = "--batchsize", usage = "training batch size, only support batchsize 1")
    var batchSize: Int = 1
    @Option(name = "--load-checkpoints-dir", usage = "path to load previous saved models to continue training")
    var loadCheckpointsDir: String = null
    @Option(name = "--load-checkpoints-epoch", usage = "the epoch num of the load models")
    var loadCheckpointsEpoch: Int = 0
    @Option(name = "--which-direction", usage = " 'AtoB'  or 'BtoA' ")
    var whichDirection: String = "AtoB"
  }

  class OptTest {
    @Option(name = "--gan-model-path", usage = "the pretrain g model")
    var modelPath: String = null
    @Option(name = "--input-image", usage = "the input image")
    var inputImage: String = null
    @Option(name = "--output-nc", usage = "of output image channels")
    var outputNC: Int = 3
    @Option(name = "--ngf", usage = "of gen filters in first conv layer")
    var ngf: Int = 64
    @Option(name = "--output-path", usage = "the output result path")
    var outputPath: String = null
    @Option(name = "--gpu", usage = "which gpu card to use, default is -1, means using cpu")
    var gpu: Int = -1
    @Option(name = "--which-direction", usage = "'AtoB'  or 'BtoA'")
    var whichDirection: String = "AtoB"
  }
}
